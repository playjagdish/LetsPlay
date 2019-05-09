//Comment
package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
//controller changes
public class Applications extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
}
