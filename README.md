# IMAD-A1-ST10476876
### Overview ###
This Android app provides simple social interaction suggestions based on the time of day entered by the user. It encourages users to stay connected with friends, family, and colleagues through small meaningful actions.

## How it works ##

## 1. UI Components ##
   The app uses three main UI elements:

* EditText (timeInput) - User enters a time of day (e.g., "morning")
* TextView (suggestionText) - Displays the suggestion
* Button (resetButton) - Clears input and suggestion

 ## 2. Reset Button Functionality  ##
 
     <img width="348" height="115" alt="Screenshot 2026-03-30 071924" src="https://github.com/user-attachments/assets/55c0a900-7980-4ab3-bccc-42559be28d09" />
* Clears the text input field
* Removes any displayed suggestions

 ## 3. Handling user input ##
 
     <img width="648" height="140" alt="Screenshot 2026-03-30 072410" src="https://github.com/user-attachments/assets/3778c5e0-fd3c-4c83-b43e-268908bcba07" />
* Triggered when the user presses “Enter” or submits input
* Converts input to lowercase and trims spaces
* Calls a function to generate a suggestion

##  4. Suggestion logic ##

<img width="869" height="271" alt="Screenshot 2026-03-30 072721" src="https://github.com/user-attachments/assets/898aae6f-7069-4196-a3db-e217a6b51a2a" />
     * Uses a when statement to match input
     * Returns a relevant social suggestion
     * Handles invalid input with a fallback message
    
      ## 5. Window Insets Handling (UI Adjustment) ##
      
      <img width="927" height="326" alt="Screenshot 2026-03-30 072756" src="https://github.com/user-attachments/assets/ad5a61e5-ac40-4817-97b5-69ae7e41fa6e" />
* Adjusts layout padding to fit system UI (status bar, navigation bar)
* Ensures content is not overlapped on modern devices

## Features ##

* Simple and user-friendly interface
* Instant suggestions based on time input
* Reset functionality
* Responsive layout handling for different devices

## Notes / Limitations ##

* Input must match predefined time phrases (e.g., "morning", "afternoon")
* No auto-suggestions or dropdown yet
* Currently text-based only (no voice input or AI features)

## Possible Improvements ## 

Add dropdown menu instead of manual typing
Support more flexible input (e.g., "8am", "evening")
Use AI or APIs for dynamic suggestions
Add animations or notifications










     
