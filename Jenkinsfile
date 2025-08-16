pipeline {
    agent any

    stages {
        stage('Gunakan Class') {
            steps {
                script {
                    // Buat objek dari class BuildInfo
                    def info = new BuildInfo(env.BRANCH_NAME, env.JOB_NAME, env.BUILD_NUMBER.toInteger())

                    // Panggil method
                    info.showInfo()

                    // Contoh penggunaan kondisi
                    if (info.isMainBranch()) {
                        println "🚀 Ini branch MAIN, jalankan deploy!"
                    } else {
                        println "🔧 Bukan branch main, jalankan testing dulu."
                    }
                }
            }
        }
    }
}
