# Jenkins Seed Job
Create a Jenkins seed job which will create a Pipeline job for each Jenkinsfile within a repository. 

1. Create a `Freestyle project` job
2. Within the ```Build``` section of the job, select ```Process Job DSLs```
3. Select ```Use the pipeline DSL script``` and copy the ```seed-job.groovy``` code
4. ```Save``` and ```Build with Parameters```

A Folder called ```TEST``` will be created.

The path to a Jenkinsfile is specified in the ```Jobs``` section of the ```seed-job.groovy``` file.   

Three jobs are created within the folder, pointing to the ```Jenkinsfile``` defined in the ```Script Path``` of the job Pipeline.

Each Job allows for the ```Branch``` parameter to be defined, The default branch is ```Master```. Change to ```test-branch-parameter``` to test a job against a different branch.