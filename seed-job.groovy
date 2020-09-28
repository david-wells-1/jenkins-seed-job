#!/usr/bin/env groovy

GITURL = 'https://github.com'
REPO = 'david-wells-1/jenkins-seed-job.git'
PROJECT = 'TEST'

folder("${PROJECT}")

jobs = [
    'app-1',
    'web-1/dev',
    'web-1/test',
]


// Create a Pipeline job for each path
jobs.each { job ->
    jobName = "${job.replace('/', '-')}"
    jobPath = "${job}"
    jobDisplayName = "${job.replace('/', '-')}"


    pipelineJob("${PROJECT}/${jobName}") {
        displayName(jobDisplayName)
        description("Deploys the ${jobPath}/Jenkinsfile")
        parameters {
            stringParam('Branch', 'master', '')
        }

        definition {
            cpsScm {
                scriptPath("${jobPath}/Jenkinsfile")
                scm {
                    git {
                        branch('$Branch')
                        remote {
                          url("${GITURL}/${REPO}")
                        }
                    }
                }    
            }
        }
    }
}