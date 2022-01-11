package day10_MoreIfStatements;
import java.util.Scanner;
public class HTTPProtocol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the code #: ");
        int statusCode = input.nextInt();
        String result;
        result = (statusCode>=100&&statusCode<=599)?(statusCode==200)?"OK":(statusCode==201)?"Created":(statusCode==202)?"Accepted" :(statusCode==301)?"Moved Permanently"
                :(statusCode==303)?"See Other":(statusCode==304)?"Not Modified":(statusCode==307)?"Temporary Redirect":(statusCode==400)?"Bad Request"
                :(statusCode==401)?"Unauthorized":(statusCode==403)?"Forbidden":(statusCode==404)?"Not Found":(statusCode==410)?"Gone"
                :(statusCode==500)?"Internal Server Error":(statusCode==503)?"Service Unavailable":"That code is not currently active":"Not a valid range";

        System.out.println("The code "+statusCode+" means "+result);
        input.close();
    }
}
/*
7.              status codes and their meanings:
	                200, OK - 201, Created - 202, Accepted - 301, Moved Permanently - 303, See Other - 304, Not Modified
	                307, Temporary Redirect - 400, Bad Request - 401, Unauthorized - 403, Forbidden - 404, Not Found
	                410, Gone - 500, Internal Server Error - 503, Service Unavailable
         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.
*/
