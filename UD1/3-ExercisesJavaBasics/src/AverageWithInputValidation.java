public class AverageWithInputValidation {
          // Declare constant
          final int NUM_STUDENTS = 3;
      
          // Declare variables
          int numberIn;
          boolean isValid;   // boolean flag to control the input validation loop
          int sum = 0;
          double average;
          ......
          
          for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
              // Prompt user for mark with input validation
              ......
              isValid = false;   // reset assuming input is not valid
              do {
                 ......
              } while (!isValid);
    
              sum += ......;
          }
          ......
}
