# Ballog-2

This repository contains the initial folder structure for the "Futsal Training Log" app.
The project is organised using the MVVM architecture pattern.

## Directory layout

```
app/
└─ src/
   └─ main/
      └─ java/
         └─ com/
            └─ futsal/
               └─ traininglog/
                  ├─ model/
                  ├─ repository/
                  ├─ view/
                  └─ viewmodel/
```

Each folder contains a `.gitkeep` file so the directories are tracked by Git.
Add your code files into the appropriate package as you develop the application.

## Basic UI

The project now includes simple activities:

- **MainActivity** shows a centered button for starting a training log.
- **TrainingLogActivity** provides a form with date, time range, category checkboxes, condition selection and a simple drawing board.

These activities and layouts are located under `app/src/main`.
