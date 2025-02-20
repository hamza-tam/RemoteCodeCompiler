# Welcome to the Compiler docs contributing guide

Thank you for investing your time in contributing to our project! 

Reading and following these guidelines will help us make the contribution process easy and effective for everyone involved. 


## Project structure

#### Config folder
All config classes should be inside this folder.

#### Executions folder 
This folder contains execution classes responsible for creating an environment of execution for a specific programming language.\
Each class has its corresponding factory.

#### Controllers folder
All Controllers should be inside this folder.

#### Services folder
Java beans, components and services should be inside this folder.


#### Streams folder
This folder is for stream processing, all Apache Kafka related code is present there.

#### Exceptions folder
All exceptions should be inside this folder.

#### AMQP folder
This folder contains code related to RabbitMq.

## Issues

### Create a new issue
If you spot a problem with the compiler, [search if an issue already exists](https://docs.github.com/en/github/searching-for-information-on-github/searching-on-github/searching-issues-and-pull-requests#search-by-the-title-body-or-comments). If a related issue doesn't exist, you can open a new one.

### Pull Request
*  Don't forget to [link PR to issue](https://docs.github.com/en/issues/tracking-your-work-with-issues/linking-a-pull-request-to-an-issue) if you are solving one.
* We may ask for changes to be made before a PR can be merged, either using [suggested changes](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/incorporating-feedback-in-your-pull-request) or pull request comments. You can apply suggested changes directly through the UI. You can make any other changes in your fork, then commit them to your branch.
* As you update your PR and apply changes, mark each conversation as [resolved](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/commenting-on-a-pull-request#resolving-conversations).
* If you run into any merge issues, checkout this [git tutorial](https://lab.github.com/githubtraining/managing-merge-conflicts) to help you resolve merge conflicts and other issues.
