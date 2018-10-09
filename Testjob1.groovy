freeStyleJob("Shanujob") 
{
label("free")
      logRotator(-1, 10)
      jdk('Java 6')
      scm {
            git {
            remote {
                name('origin')
                url('git@serverA:account/repo1.git')
            }
        }
    }
}
