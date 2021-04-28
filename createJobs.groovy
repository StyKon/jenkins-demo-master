pipelineJob('pipelineJob') {
2
    definition {
3
        cps {
4
            script(readFileFromWorkspace('pipelineJob.groovy'))
5
            sandbox()
6
        }
7
    }
8
}
9
pipelineJob('theme-park-job') {
10
    definition {
11
        cpsScm {
12
            scm {
13
                git {
14
                    remote {
15
                        url 'https://github.com/StyKon/SpringBootLocationVoiture.git'
16
                    }
17
                    branch 'master'
18
                }
19
            }
20
        }
21
    }
22
}
