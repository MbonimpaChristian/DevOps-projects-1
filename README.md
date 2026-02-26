# DevOps-projects-1
This project will have Git workflow, branching strategy, conflict resolution, CI/CD implementation using GitHub Actions, and automated test integration.

# Branching Configuration

- `main` → Production branch
- `dev` → Integration branch
- `ft/*` → Feature branches

# Git Operations Performed

# 1. Initialize Repository
```bash
git clone  https://github.com/MbonimpaChristian/DevOps-projects-1
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin  https://github.com/MbonimpaChristian/DevOps-projects-1
git push -u origin main
```

# 3. Created dev branch
```bash
git checkout -b dev
git push -u origin dev
```

# 4. Created and deleted test branch
```bash
git checkout -b test
$ echo "Testing branch" > test.tx
$ git add .
$ git commit -m "test: temporary branch testing"
[test 9002e7a] test: temporary branch testing
 8 files changed, 78 insertions(+)
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/DevOps-projects-1.iml
 create mode 100644 .idea/copilot.data.migration.ask2agent.xml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 test.tx
git checkout dev
git branch -D test
git push origin --delete test
```

# 5. Feature Branch Creation
```bash
git checkout -b ft/setup
$ echo "Meaningful placeholder" > test.java
$ touch test.java
$ git add test.java
$ git status
On branch ft/setup
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   test.java
$ git commit -m "feat(setup): add initial test.java file"


```

### 7. Git Stash Usage
```bash
# Make some changes to test.java
echo "to do the add sorting validation changes" > test.java
git stash push -m "Added sorting"
git stash list
stash@{0}: On ft/setup: Added sorting
git stash apply stash@{0}
git add test.java
git commit -m "feat(setup): add sorting validation changes"
git status
git push -u origin ft/setup
```

### 10. Merge Conflict Resolution
```bash
git merge dev
git merge ft/setup to main
# Resolve conflicts manually
<<<<<<< HEAD
...
=======
...
>>>>>>> main
git add .
git commit -m "fix: resolve merge conflicts between main and ft/setup"
git push


```

---

## 11. Terminal History
```bash
$ history >> README.md
git add README.md
git commit -m "docs: add terminal history"
git push
```


## 🤖 Automation Testing

Automated tests validate sorting functionality on:
https://practicesoftwaretesting.com/

Tests can be executed using:

```bash
mvn test
```

---

## 🚀 CI/CD Pipeline

GitHub Actions pipeline:

- Installs dependencies
- Builds project
- Runs test suite
- Fails if any test fails

Pipeline triggers:
- Every push
- Every Pull Request
- Merge into `main`

---

## 🔐 Branch Protection Rules

- Pull Requests required before merging
- CI must pass before merge
- Direct pushes to `main` are blocked

---

## 📜 Terminal History

```bash
git log --oneline
```    1  cd ..
    2  cd ..
    3  cd odoo
    4  cd odoo
    5  python odoo-bin -d odoo15 -r chris -w Malek
    6  python odoo-bin -d odoo16 -r chris -w Malek
    7  python odoo-bin
    8  pip install PyPDF2
    9  pip install --upgrade pip
   10  python odoo-bin -d odoo16 -r chris -w Malek
   11  pip install psycopg2
   12  pip install --upgrade pip
   13  python odoo-bin -d odoo16 -r chris -w Malek
   14  pip install werkzeug
   15  python odoo-bin -d odoo16 -r chris -w Malek
   16  pip install passlib
   17  python odoo-bin -d odoo16 -r chris -w Malek
   18  pip install PIL
   19  pip install --upgrade pip
   20  python odoo-bin -d odoo16 -r chris -w Malek
   21  cd ..
   22  cd ..
   23  cd odoo
   24  cd 16.0
   25  ls
   26  cd bts-odoo
   27  dir
   28  cd bts_addons
   29  git clone https://gitlab.com/bts-app-official/bts-odoo-module.git
   30  cd ..
   31  cd ..
   32  cd ..
   33  cd odoo
   34  python odoo-bin -d odoo16 -r chris -w Malek
   35  pip install PIL
   36  pip unistall PIL
   37  pip uninstall PIL
   38  pip install Pillow
   39  pip install PIL
   40  pip install --upgrade pip
   41  pip install Pillow
   42  pip install Pillow --upgrade
   43  python odoo-bin -d odoo16 -r chris -w Malek
   44  pip install reportlab
   45  python odoo-bin -d odoo16 -r chris -w Malek
   46  pip install babel
   47  python odoo-bin -d odoo16 -r chris -w Malek
   48  pip install lxml
   49  python odoo-bin -d odoo16 -r chris -w Malek
   50  pip install decorator
   51  python odoo-bin -d odoo16 -r chris -w Malek
   52  pip install dateutil
   53  pip install python-dateutil --upgrade
   54  python odoo-bin -d odoo16 -r chris -w Malek
   55  pip install polib
   56  python odoo-bin -d odoo16 -r chris -w Malek
   57  pip install idna
   58  python odoo-bin -d odoo16 -r chris -w Malek
   59  pip install requests
   60  pip install --upgrade pip
   61  python odoo-bin -d odoo16 -r chris -w Malek
   62  pip install win32service
   63  pip install pypiwin32
   64  python odoo-bin -d odoo16 -r chris -w Malek
   65  pip install --upgrade Flask
   66  pip install --upgrade pytest
   67  python odoo-bin -d odoo16 -r chris -w Malek
   68  python odoo-bin -r chris -w Malek
   69  python run.py
   70  python odoo-bin -r chris -w Malek
   71  cd ..
   72  cd ..
   73  cd odoo
   74  cd odoo16
   75  git clone https://github.com/odoo/odoo.git --branch 16.0 --depth 1
   76  git branch
   77  touch test.java
   78  git add .
   79  git status
   80  git commit -m "feat(setup):add initial test.java placeholder"
   81  git branch
   82  git push -u origin ft/setup
   83  git stash push -m "Added sorting"
   84  git stash list
   85  git stash apply stash@{0
   86  git stash apply stash@{0}
   87  git add.
   88  git add .
   89  git status
   90  git commit -m "feat(setup):add initial test.java placeholder"
   91  git push -u origin ft/setup
   92  git branch
   93  git checkout main
   94  git status
   95  git add .
   96  git checkout main
   97  git status
   98  git commit -m "changes from ft/setup"
   99  git checkout main
  100  git add .
  101  git commit -m "docs: update project ownership"
  102  git push
  103  git add .
  104  git commit -m "docs: update project ownership 2"
  105  git push
  106  git checkout ft/setup
  107  git merge main
  108  git add .
  109  git commit -m "fix: resolve merge conflict with main"
  110  git push
  111  history >> README.md
