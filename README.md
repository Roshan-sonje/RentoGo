# RentoGo


## **Github Commands**

## Initialization and Cloning:
```
git init
```
Initializes a new local Git repository in the current directory.
```
git clone <repository_url>
```
Creates a local copy of an existing remote repository.


## Staging and Committing:
```
git add <file_name>
```
Adds a specific file to the staging area, preparing it for the next commit.

```
git add .
```
Adds all modified and new files in the current directory to the staging area.

```
git commit -m "Commit message"
```
Records the staged changes as a new commit in the local repository with a descriptive message.

```
git status
```
Shows the current state of the working directory and staging area, indicating which files are modified, staged, or untracked.
   
# #Branching and Merging:
```
git branch
```
Lists all local branches.

```
git branch <new_branch_name>
```
Creates a new branch.

```
git checkout <branch_name>
```
Switches to a different branch.

```
git merge <branch_to_merge>
```
Integrates changes from a specified branch into the current branch.

```
git switch <branch_name>
```
A newer, more explicit command for switching branches (alternative to git checkout for branch switching).
    
#Remote Operations:
```
git pull
```
Fetches changes from the remote repository and automatically merges them into the current local branch. 

```
git push <remote_name> <branch_name>
```
Uploads local commits to a remote repository.
