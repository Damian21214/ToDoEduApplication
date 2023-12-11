-- TO_DO_LIST Records
INSERT INTO PUBLIC.TO_DO_LIST (ID, CREATED, MODIFIED, STATUS, STATUS_CHANGED, TITLE)
VALUES (1, NOW(), NOW(), 'CREATED', NOW() + INTERVAL '1' DAY, 'Shopping');
INSERT INTO PUBLIC.TO_DO_LIST (ID, CREATED, MODIFIED, STATUS, STATUS_CHANGED, TITLE)
VALUES (2, NOW(), NOW(), 'IN_PROGRESS', NOW() + INTERVAL '1' DAY, 'Learning');
INSERT INTO PUBLIC.TO_DO_LIST (ID, CREATED, MODIFIED, STATUS, STATUS_CHANGED, TITLE)
VALUES (3, NOW(), NOW(), 'COMPLETED', NOW() + INTERVAL '1' DAY, 'Meeting');


-- TO_DO_TASK Records for Each TO_DO_LIST
INSERT INTO TO_DO_TASK (ID, CREATED, MODIFIED, DESCRIPTION, SCHEDULED, STATUS, STATUS_CHANGED, TITLE, TO_DO_LIST_ID)
VALUES (1, NOW(), NOW(), 'Buying apples and bananas.', null, 'CREATED', null, 'Buy Fruits', 1),
       (2, NOW(), NOW(), 'Learning about AI.', NOW(), 'IN_PROGRESS', NOW() + INTERVAL '1' DAY, 'AI', 2),
       (3, NOW(), NOW(), 'Meeting with the team.', NOW(), 'COMPLETED', NOW() + INTERVAL '1' DAY, 'Team Meeting', 3);

-- TO_DO_TASK Records for Shopping TO_DO_LIST
INSERT INTO TO_DO_TASK (ID, CREATED, MODIFIED, DESCRIPTION, SCHEDULED, STATUS, STATUS_CHANGED, TITLE, TO_DO_LIST_ID)
VALUES (4, NOW(), NOW(), 'Purchasing vegetables for this week.', NOW(), 'IN_PROGRESS', NOW(), 'Buy Vegetables', 1),
       (5, NOW(), NOW(), 'Securing essential commodities.', NOW(), 'CREATED', NOW(), 'Buy Essentials', 1);

-- TO_DO_TASK Records for Learning TO_DO_LIST
INSERT INTO TO_DO_TASK (ID, CREATED, MODIFIED, DESCRIPTION, SCHEDULED, STATUS, STATUS_CHANGED, TITLE, TO_DO_LIST_ID)
VALUES (6, NOW(), NOW(), 'Attend online class on Calculus.', NOW(), 'COMPLETED', NOW() + INTERVAL '1' DAY,
        'Calculus Class', 2),
       (7, NOW(), NOW(), 'Read about the history of AI.', NOW(), 'IN_PROGRESS', NOW() + INTERVAL '1' DAY,
        'History of AI', 2),
       (8, NOW(), NOW(), 'Complete java programming assignment.', NOW(), 'COMPLETED', NOW() + INTERVAL '1' DAY,
        'Java Assignment', 2);

-- TO_DO_TASK Records for Meetings TO_DO_LIST
INSERT INTO TO_DO_TASK (ID, CREATED, MODIFIED, DESCRIPTION, SCHEDULED, STATUS, STATUS_CHANGED, TITLE, TO_DO_LIST_ID)
VALUES (9, NOW(), NOW(), 'Meeting with the product team', NOW(), 'IN_PROGRESS', NOW(), 'Product Team Meeting', 3),
       (10, NOW(), NOW(), 'Arranging a meeting with sales team.', NOW(), 'IN_PROGRESS', NOW() + INTERVAL '1' DAY,
        'Sales Team Meeting', 3),
       (11, NOW(), NOW(), 'Skype call with the marketing team', NOW(), 'COMPLETED', NOW() + INTERVAL '1' DAY,
        'Marketing Team Skype', 3);
