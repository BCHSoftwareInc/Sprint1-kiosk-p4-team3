# QA Test Execution Matrix - Sprint 1
* **QA Tester:** @username
* **Client Deliverable:** Console Interactive Kiosk

| Test ID | Target Input Field | Test Input Description | Expected Output | Actual Behavior | Status (Pass/Fail) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| TC-01 | Full Name | Standard text (`"Jane Doe"`) | Formatted correctly in ASCII box | Formatted correctly in ASCII box | Pass |
| TC-02 | Department/Role | Blank input (`""`) | Handles gracefully without crash | Handles gracefully without crash | Pass |
| TC-03 | Email / Contact | Valid string (`"test@bch.org"`) | Stored & printed accurately | Stored & printed accurately | Pass |
| TC-04 | Badge Tier | Lowercase text (`"vip"`) | Clean output on badge | Clean output on badge | Pass |
| TC-04 | Badge Tier | Incorrect Role | Prevent printing incorrect role | Prints incorrect role | FAIL |
