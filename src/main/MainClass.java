/*
	Load the main from here
	the "MainFrame" will be loaded
*/
	package main;

	import view.client.*;
    import db.DBConnectionProvider;
    import db.DBDataProvider;

	public class MainClass{
		public static void main(String args[]){
			MainFrame window = new MainFrame();
		}
	}
