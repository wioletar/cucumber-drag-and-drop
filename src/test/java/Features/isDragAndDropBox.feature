# new feature
# Tags: optional

Feature: Is box drag and drop
Background:
  Given Open drag and drop sub page

Scenario: Simple drag and drop element
  Given Switch to frame
  When Drag and drop box
  Then Verification if appears Dropped! text


