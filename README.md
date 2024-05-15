**STOCK MANAGEMENT**

Stock Class have these details
stock id (unique : string), stock name (string), company name(string) , price (double), closing date (Date) , quantity (int)

APPLICATION FUNCTIONALITY
1. Add stock in application.
   Accepted all the stock details & inserted it in the DS
   Ensure no duplicate stock ids. Add a validation rule that stock closing date must be a future date.
   In case of invalid inputs , throw custom exception & handle it.

2. View Stock by Company Name.
   input : company name
   Output is all the stocks published by that company.

3. Purchase Stock.
   input : stock id , quantity
   In case of invalid stock id or insufficient available quantity , throw custom exception , with suitable error message.
   In case of success , update stock quantity suitably.
   
4. Sell Stock.
   input : stock id , quantity
   In case of invalid stock id  throw custom exception , with suitable error message.
   In case of success , update stock quantity suitably.

5. Save and Exit (Serialization)
   save all stock details in a binary file (filename.ser), using serialization.

