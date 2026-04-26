# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

A collection of standalone Java programming logic exercises from the [DevDojo Programming Logic course](https://docs.google.com/document/d/1yt9gyXl8GbRqqIt_WeZe4zjzKdaH_44i5_3LS8s2zSU/edit?pli=1&tab=t.0). Each file in `src/ProgrammingLogic/` is a self-contained exercise with its own `main()` method.

## Running Programs

This is a plain IntelliJ IDEA project with no build tool (no Maven or Gradle). To run a program:

- **From IntelliJ**: Open the desired `.java` file and run its `main()` method directly via the IDE.
- **From command line** (compile then run):
  ```bash
  javac -d out src/ProgrammingLogic/<ClassName>.java
  java -cp out ProgrammingLogic.<ClassName>
  ```

There are no tests, no linting configuration, and no external dependencies — only the Java standard library.

## Code Structure

- All exercises live in a single package: `ProgrammingLogic`
- Each exercise is a standalone class; no shared utilities or base classes
- Programs interact via `Scanner` on `System.in` and print results to `System.out`

## Conventions

- Class names are descriptive and PascalCase, matching the exercise topic (e.g., `StudentGradeCalculator`, `FibonacciSequence`)
- New exercises follow the same pattern: one class, one `main()` method, `Scanner` for input
- Numeric output uses `printf("%.2f", value)` for formatted decimals
- No external libraries should be added
