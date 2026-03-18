import java.util.*;
import java.time.LocalDate;

public class BlogSystem {

    static class Blog {
        private int id;
        private String title;
        private String content;
        private String author;
        private String category;
        private LocalDate date;

        public Blog(int id, String title, String content, String author, String category) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.author = author;
            this.category = category;
            this.date = LocalDate.now();
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String getCategory() {
            return category;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        @Override
        public String toString() {
            return "\nID: " + id +
                    "\nTitle: " + title +
                    "\nContent: " + content +
                    "\nAuthor: " + author +
                    "\nCategory: " + category +
                    "\nDate: " + date +
                    "\n---------------------------";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Blog> blogs = new ArrayList<>();
        int idCounter = 1;
        int choice;

        do {
            System.out.println("\n===== BLOG MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Blog (Admin)");
            System.out.println("2. Edit Blog (Admin)");
            System.out.println("3. Delete Blog (Admin)");
            System.out.println("4. View All Blogs");
            System.out.println("5. View Blog by ID");
            System.out.println("6. Search Blog by Title");
            System.out.println("7. Filter by Category");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Content: ");
                    String content = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    blogs.add(new Blog(idCounter++, title, content, author, category));
                    System.out.println("Blog Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Blog ID to Edit: ");
                    int editId = sc.nextInt();
                    sc.nextLine();

                    boolean foundEdit = false;
                    for (Blog blog : blogs) {
                        if (blog.getId() == editId) {
                            System.out.print("New Title: ");
                            blog.setTitle(sc.nextLine());
                            System.out.print("New Content: ");
                            blog.setContent(sc.nextLine());
                            System.out.print("New Category: ");
                            blog.setCategory(sc.nextLine());
                            System.out.println("Blog Updated Successfully!");
                            foundEdit = true;
                            break;
                        }
                    }
                    if (!foundEdit)
                        System.out.println("Blog Not Found!");
                    break;

                case 3:
                    System.out.print("Enter Blog ID to Delete: ");
                    int deleteId = sc.nextInt();
                    boolean removed = blogs.removeIf(blog -> blog.getId() == deleteId);
                    if (removed)
                        System.out.println("Blog Deleted Successfully!");
                    else
                        System.out.println("Blog Not Found!");
                    break;

                case 4:
                    if (blogs.isEmpty()) {
                        System.out.println("No Blogs Available!");
                    } else {
                        for (Blog blog : blogs)
                            System.out.println(blog);
                    }
                    break;

                case 5:
                    System.out.print("Enter Blog ID: ");
                    int viewId = sc.nextInt();
                    boolean foundView = false;
                    for (Blog blog : blogs) {
                        if (blog.getId() == viewId) {
                            System.out.println(blog);
                            foundView = true;
                            break;
                        }
                    }
                    if (!foundView)
                        System.out.println("Blog Not Found!");
                    break;

                case 6:
                    System.out.print("Enter Title Keyword: ");
                    String keyword = sc.nextLine();
                    boolean foundSearch = false;
                    for (Blog blog : blogs) {
                        if (blog.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                            System.out.println(blog);
                            foundSearch = true;
                        }
                    }
                    if (!foundSearch)
                        System.out.println("No Matching Blogs Found!");
                    break;

                case 7:
                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();
                    boolean foundCategory = false;
                    for (Blog blog : blogs) {
                        if (blog.getCategory().equalsIgnoreCase(cat)) {
                            System.out.println(blog);
                            foundCategory = true;
                        }
                    }
                    if (!foundCategory)
                        System.out.println("No Blogs in this Category!");
                    break;

                case 0:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}