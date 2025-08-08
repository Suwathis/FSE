
# Git Branch and Merge Lab

## Branching
1. Create new branch:
   ```bash
   git branch GitNewBranch
   ```

2. List all branches:
   ```bash
   git branch -a
   ```

3. Switch to the new branch and add files:
   ```bash
   git checkout GitNewBranch
   echo "Branch specific content" > branch_file.txt
   git add branch_file.txt
   git commit -m "Add file in GitNewBranch"
   ```

4. Check git status:
   ```bash
   git status
   ```

## Merging
1. Switch to master:
   ```bash
   git checkout master
   ```

2. Show CLI differences:
   ```bash
   git diff master..GitNewBranch
   ```

3. View visual differences (using P4Merge):
   ```bash
   git difftool master..GitNewBranch
   ```

4. Merge branch into master:
   ```bash
   git merge GitNewBranch
   ```

5. View log:
   ```bash
   git log --oneline --graph --decorate
   ```

6. Delete the branch and check status:
   ```bash
   git branch -d GitNewBranch
   git status
   ```
