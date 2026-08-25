# BCH Software Scrum Roles: Sprint 1 Execution Guide

## Product Manager (PM)

**Add Card 6 ("[PM] Sprint Progress Monitoring & Git Sync") to yourself.**

- **Daily Standup:** Lead 2-minute standup (What did you do? Doing today? blockers?)
- **Quality:** Confirm QA sweeps pass and CCA signs off before closing tasks.
- **End-of-Day Git Check-in Protocol (Preventing Merge Conflicts):**
  1. Call a "Code Freeze" 10 minutes before the bell.
  2. Sequential Push Order (Teammates commit and push one at a time):
     - **1st:** SE commits and pushes starter code (e.g., python/main.py).
     - **2nd:** QA pulls (git pull), then commits and pushes docs/QA_TEST_MATRIX.md.
     - **3rd:** CCA pulls (git pull), then commits and pushes docs/SECURITY_AUDIT.md.
  3. Verify on github.com that all 3 files are updated with commit messages.

## Software Engineer (SE)

- **Starter File:** Open your course starter file (e.g., main.py).
- **Blueprinting:** Draft plain-English pseudocode for input prompts and ASCII layout before coding. (use comments e.g start line with #)
- **Active Build:** Implement input prompts for the 4 fields and print output.
- **Collaboration:** Provide sample runs to QA and walk through variable handling with CCA.

## Cyber Compliance Analyst (CCA)

### While Developer is Coding:

1. Open docs/SECURITY_AUDIT.md and draft input sanitization guidelines.
2. Audit Prompt Clarity: Verify SE prompts give explicit instructions to the user (e.g., "Enter Email: " vs vague prompts)
3. PII Review: Check that no unnecessary sensitive data (e.g., passwords, SSNs) are collected or echoed to the console screen.
4. Terminal Injection Analysis: Plan out rules for special characters (\n, quotes, %) that could break the console output layout.

### Handoff:

Once SE has working code, audit the script and sign SECURITY_AUDIT.md.

## QA Tester (QA) | Test Suite Design & Verification

### While Developer is Coding (Pre-Test Matrix Design):

1. Open docs/QA_TEST_MATRIX.md and pre-populate test cases across all 4 fields:
   - **Normal Cases:** Standard names ("Jane Doe"), standard emails and roles.
   - **Boundary Cases:** 1-character names, extremely long inputs (50+ chars).
   - **Invalid Entries:** Empty (pressing Enter immediately), symbols (!@#$%).
2. Define Expected Output for each case before testing begins.

### Handoff & Execution:

Once SE finishes the script, run all test sweeps live, record Actual Results.
