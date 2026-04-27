class room {
    public static void main(String[] args) {
        int[] rooms = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        String[] floors = {"B","1","2","3","4","5","6","7","8"};
        String[] wings = {"N","S","E","W"};
        String create = "INSERT INTO Room (RoomName) VALUES ";

        for (String floor : floors) {
            for (String wing : wings) {
                for (int room : rooms) {
                    create += "('" + floor + wing + room + "'), ";
                }
            }
        }
        // checked on mysql database on putty, works!
        create = create.substring(0, create.length() - 2);
        System.out.println(create + ";");
    }
}