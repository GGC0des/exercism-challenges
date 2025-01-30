class Badge {
    public String print(Integer id, String name, String department) {
      return String.format("[%d] - %s - %s", id , name, department.toUpperCase());
    }
}
