/*
    Load the main from here
    the "MainFrame" will be loaded
*/
    package main;

    import view.client.*;
    import view.signInForm.SignIn;
    import view.signInForm.SignInDocumentListener;
    import view.signUpForm.SignUp;
    import view.signUpForm.SignUpDocumentListener;
    import db.DBConnectionProvider;
    import db.DBDataProvider;
    import db.UserData;

    public class MainClass{
        public static void main(String args[]){
            MainFrame window = new MainFrame();
            // SignUp sampleSignUp = new SignUp("Sign Up Form");
        }
    }
