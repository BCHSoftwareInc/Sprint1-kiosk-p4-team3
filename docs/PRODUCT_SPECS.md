================================================================================
BCH SOFTWARE INC. | ENTERPRISE PRODUCT SPECIFICATION BRIEF
================================================================================
PROJECT TITLE:    Apex Self-Service Terminal & Registration Kiosk
SPRINT CYCLE:     Sprint 1 - Core Input/Output & Personalization
TARGET CLIENT:    Apex Entertainment / BCH Facility Services
CLEARANCE LEVEL:  Level 1 - Public Console Terminal
================================================================================

1. EXECUTIVE SUMMARY
Apex Entertainment requires a lightweight terminal application to register event
attendees and print customized physical passes in order to eliminate front-desk
bottlenecks.

--------------------------------------------------------------------------------
2. TECHNICAL SCOPE CONSTRAINTS
• Allowed: Standard console input (input/ReadLine/Scanner), print output,
variables, and string concatenation/interpolation.
• Out of Scope for Sprint 1: if/else logic, loops, and external database
packages.

--------------------------------------------------------------------------------
3. MANDATORY FUNCTIONAL REQUIREMENTS
[ ] Welcome Header: Displays ASCII branding (e.g., "APEX VISITOR CHECK-IN").
[ ] 4 Data Prompts: Prompts for and stores:
    1. Full Name (Attendee first & last name)
    2. Department / Organization (Company or division)
    3. Contact Email / Handle (Primary point of contact)
    4. Access Level / Badge Tier (VIP, Speaker, Attendee, Vendor, Staff)
[ ] Formatted ASCII Badge Output: Displays a clean border bounding box:

    +-----------------------------------------------+
    |             APEX ENTERTAINMENT PASS           |
    |-----------------------------------------------|
    | ATTENDEE : Jane Doe                           |
    | ORG      : BCH Cybersecurity Division         |
    | CONTACT  : jdoe@bchsoftware.org               |
    | ACCESS   : VIP ALL-ACCESS                     |
    | ISSUER   : BCH Software Terminal System       |
    +-----------------------------------------------+

--------------------------------------------------------------------------------
4. SPRINT 1 DEFINITION OF "DONE"
[ ] All 6 Kanban board cards updated and verified.
[ ] App executes end-to-end without syntax or crash errors.
[ ] QA Test Matrix (docs/QA_TEST_MATRIX.md) completed with all test sweeps.
[ ] Security Audit (docs/SECURITY_AUDIT.md) certified and signed by CCA.
[ ] All deliverables committed and pushed to GitHub without merge conflicts.
================================================================================
