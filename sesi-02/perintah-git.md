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

4. Kembali ke masa lalu

    Command : 

        git checkout <commit-id>

    Keterangan : `commit-id` didapat dari perintah `git log`

    Contoh : 

        git checkout 11c67f0

    Output : 

        HEAD is now at 11c67f0... Commit pertama

5. Kembali ke versi terbaru

    Command : 

        git checkout <nama-branch>

    Contoh : 

        git checkout master

    Output :

        Previous HEAD position was 11c67f0... perintah menambahkan remote repo
        Switched to branch 'master'

## Operasi Remote ##

1. Daftarkan Github sebagai remote repository

    Command : 

        git remote add <nama> <URL>

    Contoh : 

        git remote add github-endy git@github.com:endymuhardin/pemrograman-1-2013.git

    Output : 

        tidak ada

2. Melihat daftar remote repository

    Command :

        git remote -v

    Output : 

        github-endy	git@github.com:endymuhardin/pemrograman-1-2013.git (fetch)
        github-endy	git@github.com:endymuhardin/pemrograman-1-2013.git (push)

3. Upload repo lokal ke remote

    Command :

        git push <nama-remote> <nama-branch-lokal>

    Contoh : 

        git push github-endy master

    Output :

        Counting objects: 8, done.
        Delta compression using up to 4 threads.
        Compressing objects: 100% (4/4), done.
        Writing objects: 100% (8/8), 1.13 KiB, done.
        Total 8 (delta 1), reused 0 (delta 0)
        To git@github.com:endymuhardin/pemrograman-1-2013.git
         * [new branch]      master -> master

4. Mengambil repository yang sudah ada di remote repo

    Command :

        git clone <url>

    Contoh :

        git clone git@github.com:endymuhardin/materi-kuliah-java-fundamental-2011.git

    Output :

        Cloning into 'materi-kuliah-java-fundamental-2011'...
        remote: Counting objects: 900, done.
        remote: Compressing objects: 100% (409/409), done.
        remote: Total 900 (delta 270), reused 900 (delta 270)
        Receiving objects: 100% (900/900), 4.73 MiB | 92 KiB/s, done.
        Resolving deltas: 100% (270/270), done.

5. Mengambil update terbaru dari remote repo

    Command :
        
        git pull

    Output :

        remote: Counting objects: 1380, done.
        remote: Compressing objects: 100% (938/938), done.
        remote: Total 1330 (delta 465), reused 117 (delta 44)
        Receiving objects: 100% (1330/1330), 108.57 KiB | 3 KiB/s, done.
        Resolving deltas: 100% (465/465), completed with 20 local objects.
        From repo2.artivisi.com:project-akunting
           6d98e0d..38dac2d  master     -> artivisi/master
        Updating 6d98e0d..38dac2d
        Fast-forward
         accounting-domain/src/main/java/com/artivisi/accounting/domain/Account.java           |   5 +-
         accounting-domain/src/main/java/com/artivisi/accounting/domain/Journal.java           |   3 +-
         .../src/main/java/com/artivisi/accounting/service/BelajarRestfulService.java          |  33 +++--
        
        ...

        27 files changed, 1130 insertions(+), 509 deletions(-)
         create mode 100644 accounting-service/src/main/java/com/artivisi/accounting/dao/AccountSummaryDao.java
         rename accounting-service/src/main/java/com/artivisi/accounting/dao/{EntriDao.java => EntryJournalDao.java} (64%)
