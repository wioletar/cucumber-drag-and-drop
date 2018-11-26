# new feature
# Tags: optional
@smokeTest
Feature: Is box drag and drop
Background:
  Given open droppable subpage

Scenario: Simple drag and drop element
  Given Switch to frame
  When Drag and drop box
  Then Verification if appears Dropped! text


