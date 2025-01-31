class Badge {
    public String print(Integer id, String name, String department) {
      if (id == null) {
        if (department == null) {
          return name + " - OWNER";
        }
        return String.format("%s - %s", name, department.toUpperCase());
      }
      if (department == null) {
        return String.format("[%d] - %s - OWNER", id, name);
      }
      return String.format("[%d] - %s - %s", id , name, department.toUpperCase());
    }
}
