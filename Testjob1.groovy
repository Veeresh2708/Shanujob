freeStyleJob("Shanujob") 
{
label("free")
      logRotator(-1, 10)
      jdk('Java 6')
      scm {
        github("jenkinsci/job-dsl-plugin","master")
    }
}
