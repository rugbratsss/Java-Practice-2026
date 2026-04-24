Java 2026 — Practice Repository
A personal Java practice repository covering core string manipulation, validation logic, arrays, and object-oriented problem solving. Files were written iteratively as concepts were revisited and refined — multiple versions of the same program are intentional and represent progressive learning.

Topics Covered
String Methods
Hands-on exploration of built-in Java String methods.
FileWhat it practiceslengthOfString.java.length() on a hardcoded stringcharAtmethod.java.charAt() to access a character by indexsubstringMethod1.java.substring(startIndex) — extract from index to endsusbtringMethod2.java.substring(startIndex, endIndex) — extract a rangevowelChecker.javaCharacter.toLowerCase() + checking against vowel set

Case Conversion
Building uppercase/capitalize logic both manually (char-by-char) and using built-in methods.
FileWhat it practicesUpperCase.javaManual loop using Character.toUpperCase() with Scanner inputupperCase2.javaSame concept on a hardcoded stringcapitalized.javaTitle-case a sentence — first versioncapitalized2.javaTitle-case repeat — minor spacing variationcapitalSentence.javaTitle-case final version — cleaner spacing logic

Initials & Filename Extractor
Extracting initials from a full name and building a formatted filename string. Iterated multiple times to get the ordering of initials right.
FileWhat it practicesinitialsExtractor.javaFirst attempt — 2-part name, basic initialsiniExtractor2.java3-part name, surname extracted separatelyiniEx.javaAdjusted initial ordering (first + last + second)filenameExt.javaFinal version — correct first + second _ surname _ studNumber.zip format

Password Validator
Validates a password for length, uppercase, lowercase, digit, and special character. Rebuilt progressively from a single-method approach to a clean multi-method design.
FileWhat it practicesPasswordVerify.javaFirst version — all logic inline in mainPasswrdVerify2.javaCleaned up version — same single-method approachPasswordVerify3.javaRefactored — separate boolean methods per rulepasswordVerify4.javaRepeat of v3 structure (note: checkSpecial/checkDigit/checkLower all incorrectly check isUpperCase — a known bug from the practice session)ct2.javaMost complete version — isStrongPassword() helper, named check methods, clean output

ID Extractor
Parses a South African 13-digit ID number to extract birth year, month, day, and gender. Rebuilt several times to refine the digit ordering and add a gender check.
FileWhat it practicesIDExtractor.javaFirst version — getMonthName() helper method, extracts year/month/dayIDextractor2.javaAdded gender extraction from digits 6–10idExtractor4.javaSame as v2, loop structure refinedIDEXTRACOR.javaAlternate digit order (yy/dd/mm instead of yy/mm/dd) — practice variationIDEXTRACTORr.javaCorrected ordering back to yy/mm/dd, added exit on "z"

Username & Password Splitter
Takes input in the format Username#password, splits on #, and extracts details. Written twice with the same logic.
FileWhat it practicesUsernamePassword.javaindexOf(), substring(), static helper methodsusernama.javaExact repeat — re-typed for practice

Streaming Services Application
A multi-method array-based program managing a list of streaming services. The most complex program in the repo — went through bug-fixing iterations.
FileWhat it practicesStreamingServicesApplication.javaArrays, bubble sort, random population, Scanner input validation, display formatting
Key methods:

populateSubscribers() — fills subscriber counts with random values (100,000–500,000)
populateRatings() — takes user input (1–5) with input validation loop
mostWatchedService() — finds the index of the highest subscriber count
sortServiceProvider() — bubble sort across 4 parallel arrays simultaneously
displayStreamingServices() — formatted table output


EduTrack Platform (SkontiriEduTrack)
A variation of the streaming services program applied to online learning platforms. Cleaner implementation written after the streaming app was debugged.
FileWhat it practicesSkontiriEduTrack.javaSame patterns as StreamingServicesApplication — arrays, sort, random, display — applied to educational platforms (Coursera, Udemy, etc.)

Notes

Multiple files covering the same concept are intentional — they track how understanding improved across sessions.
Some files contain known bugs that were identified and fixed in later versions (e.g. passwordVerify4.java checking isUpperCase in all four methods).
Naming inconsistencies (e.g. usernama, PasswrdVerify2, IDEXTRACOR) reflect real-time typing during practice rather than production code.
The java file (no extension) in the directory is a leftover artifact and can be ignored.


How to Run
Each file is a standalone Java program. Compile and run individually:
bashjavac FileName.java
java FileName

Requires Java 8 or higher.
