Feature: Verify Google products

  Scenario Outline: Verify google products Links
    Given Go to <url>
    When Body contains <text>
    Then Page title should be equal <title>

    Examples:
      | url                                                 | text   | title                                               |
      | https://earth.google.com/web/                       | Earth  | Google Earth                                        |
      | https://about.google/intl/en/products/#all-products | Chrome | Browse All of Google's Products & Services - Google |