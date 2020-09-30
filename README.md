# jenkins-dsl-script
Create Jenkins jobs from a Groovy DSL seed job

1. Create a `Freestyle project` job
2. Within the ```Build``` section of the job, select ```Process Job DSLs```
3. Select ```Use the pipeline DSL script``` and copy the ```seed-job.groovy``` code
4. ```Save``` and ```Build with Parameters```

A Folder called ```TEST``` will be created.

Three jobs are created within the folder, pointing to the ```Jenkinsfile``` defined in the ```Script Path``` of the job Pipeline.

Each Job allows for the Branch parameter to be defined, default is ```Master```. Change to ```test-branch-parameter``` to test the Job against a different branch.