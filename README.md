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

### 2. Created dev branch
```bash
git checkout -b dev
git push -u origin dev
```

### 3. Created and deleted test branch
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
git branch -d test
git push origin --delete test
```

### 4. Automation for sorting(ft/pipeline)
```bash
git checkout -b ft/pipeline
Initialize Maven:
mvn archetype:generate.
Add Playwirght dependency in pom.xl
Create a test class for sorting functionality and implement test cases.
Run tests locally to ensure they are working.
mvn test 
git add .
git commit -m "feat: add sorting test cases"
git push -u origin ft/pipeline

```



