// Return a String Object
class SimpleErrorMsg {
    String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };

    // Return the error message; instead of void we have String
    String getErrorMessage(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Invalid Error Code";
        }
    }
}

// returns an object
class AdvancedErrorMsg {
    String msg;
    int severity;
    
    AdvancedErrorMsg(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };
    int howbad[] = { 3, 3, 2, 4 };
    AdvancedErrorMsg getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length) {
            return new AdvancedErrorMsg(msgs[i], howbad[i]);
        } else {
            return new AdvancedErrorMsg("Invalid Error Code!", 0);
        }
    }
}

public class Returning {
    public static void main(String[] args) {
        SimpleErrorMsg err = new SimpleErrorMsg();
        ErrorInfo err2 = new ErrorInfo();
        AdvancedErrorMsg e;

        e = err2.getErrorInfo(2);
        System.out.println(e.msg + ". Severity: " + e.severity);

        e = err2.getErrorInfo(28);
        System.out.println(e.msg + ". Severity: " + e.severity);

        System.out.println(err.getErrorMessage(2));
        System.out.println(err.getErrorMessage(19));
    }
}