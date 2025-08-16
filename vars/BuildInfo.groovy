class BuildInfo {
    String branch
    String job
    int number

    // Constructor (otomatis di Groovy bisa lewat map juga)
    BuildInfo(String branch, String job, int number) {
        this.branch = branch
        this.job = job
        this.number = number
    }

    // Method untuk menampilkan info
    def showInfo() {
        println "=== Informasi Build ==="
        println "Branch   : ${branch}"
        println "Job      : ${job}"
        println "Build #  : ${number}"
    }

    // Method untuk cek branch
    def isMainBranch() {
        return branch == "main"
    }
}
