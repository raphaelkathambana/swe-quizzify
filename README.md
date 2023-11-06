# Quizzify

## **Java-based Quiz Application with GUI**

### **1. Business Understanding and Solution Provided:**

- The project aims to create a Java-based quiz application with a graphical user interface. Users can take quizzes on various topics. The application should also support quiz creation and management by administrators.

### **2. System Requirements:**

- **Quiz Creation:**
  - Develop a feature to create and manage quizzes.
  - Include options for multiple-choice questions and text-based questions.
- **Quiz Taking:**
  - Implement quiz-taking functionality, including answering questions and scoring.
  - Allow users to select quizzes and answer questions sequentially.
- **User Authentication:**
  - Provide user registration and login for tracking quiz progress and managing created quizzes.
- **User Roles:**
  - Differentiate between quiz takers and quiz creators (administrators).

### **3. Data Processing:**

- **Quiz Data:**
  - Store quiz questions, options, correct answers, and metadata (e.g., quiz title, description).
  - Use a database to manage quiz data.
- **Validation and Scoring:**
  - Validate user responses and calculate scores.
  - Provide immediate feedback on the correctness of answers.
- **Score Tracking:**
  - Record users' quiz results and display their score history.
- **Reports:**
  - Generate performance reports for quiz creators/administrators.

### **4. Access Control:**

- **User Accounts:**
  - Implement user registration and login.
  - Store user data, including username, password, and user role.
- **User Roles:**
  - Define roles such as quiz takers and quiz creators.
  - Control access to quiz creation and management.

### **5. Creativity and Diligence:**

- **Additional Features:**
  - Implement features like timed quizzes, leader boards, and a quiz editor for administrators.
  - Explore the possibility of image-based questions.
- **User Interface:**
  - Design an engaging and interactive user interface using JavaFX.
  - Ensure a user-friendly experience during quiz-taking and quiz creation.
- **User Feedback:**
  - Provide feedback during quiz-taking, including progress bars and score updates.
  - Create a clean and visually appealing design for the application.

## Getting Started

Visit the [Setup.md](Setup.md) page for more information on how to configure the  application.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
