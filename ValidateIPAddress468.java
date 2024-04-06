
class Solution {
    public String validIPAddress(String ip) {
        if (ip == null || ip.length() == 0) {
            return "Neither";
        }
        if (ip.contains(".")) {
            return checkIPv4(ip);
        } else {
            return checkIPv6(ip);
        }
    }

    public static String checkIPv4(String ip) {
        String neither = "Neither";
        if (ip.startsWith(".") || ip.endsWith(".")) {
            return neither;
        }
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return neither;
        }
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 3 || (part.charAt(0) == '0' && part.length() > 1)) {
                return neither;
            }
            for (int i = 0; i < part.length(); i++) {
                if (!Character.isDigit(part.charAt(i))) {
                    return neither;
                }
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return neither;
            }
        }
        return "IPv4";
    }

    public static String checkIPv6(String ip) {
        String neither = "Neither";
        if (ip.startsWith(":") || ip.endsWith(":")) {
            return neither;
        }
        String[] parts = ip.split(":");
        if (parts.length != 8) {
            return neither;
        }
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4) {
                return neither;
            }
            for (int i = 0; i < part.length(); i++) {
                char ch = part.charAt(i);
                if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))) {
                    return neither;
                }
            }
        }
        return "IPv6";
    }
}
