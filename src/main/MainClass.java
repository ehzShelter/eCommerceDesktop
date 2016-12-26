/*
    Load the main from here
    the "MainFrame" will be loaded
*/
    package main;

    import view.client.*;
    import view.signUpForm.SignUp;
    import view.signInForm.SignInDocumentListener;
    import db.DBConnectionProvider;
    import db.DBDataProvider;

    public class MainClass{
        public static void main(String args[]){
            MainFrame window = new MainFrame();
            // SignUp sampleSignUp = new SignUp("Sign Up Form");
        }
    }
