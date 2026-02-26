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

### 5. Git Stash Usage
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

### 6. Merge Conflict Resolution
```bash
git merge dev
git merge ft/setup
# Resolve conflicts manually
```

---

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
```