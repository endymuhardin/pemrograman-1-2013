# Perintah Dasar Git #

## Operasi Lokal ##

1. Membuat repository (database)

    Command : 

        git init <nama-folder>

    Contoh : 
        
        git init pemrograman-1-2013

    Output : 

        Initialized empty Git repository in /home/endy/workspace/git-clones/pemrograman-1-2013/.git/


2. Menyimpan file ke dalam repository. Command dilakukan dalam folder yang berisi `.git`

    Command : 

        git add <nama-file>
        git commit -m "Keterangan commit"

    Contoh : 

        git add perintah-git.md
        git commit -m "Commit pertama"

    Output : 

        [master (root-commit) 11c67f0] Commit pertama
            1 file changed, 19 insertions(+)
            create mode 100644 sesi-02/perintah-git.md

3. Melihat history

    Command : 

        git log

    Output :

        commit 11c67f02889bbc31c31667c0a99b033656ae33b7
        Author: Endy Muhardin <endy.muhardin@gmail.com>
        Date:   Fri Sep 13 10:04:06 2013 +0700

4. Daftarkan Github sebagai remote repository

    Command : 

        git remote add <nama> <URL>

    Contoh : 

        git remote add github-endy git@github.com:endymuhardin/pemrograman-1-2013.git

    Output : 

        tidak ada

5. Melihat daftar remote repository

    Command :

        git remote -v

    Output : 

        github-endy	git@github.com:endymuhardin/pemrograman-1-2013.git (fetch)
        github-endy	git@github.com:endymuhardin/pemrograman-1-2013.git (push)



