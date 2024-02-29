package yorku.eecs.view;

import yorku.eecs.controller.ViewSwitcher;
import yorku.eecs.controller.CardController;
import yorku.eecs.model.User;

import javax.swing.*;
import java.awt.*;

public class MainUI extends JFrame implements ViewSwitcher {
    private final CardController cardController;
    private final ViewSwitcher viewSwitcher = this;
    private final JPanel cardPanel;

    public MainUI() {
        // Setup JFrame
        setTitle("YorkU Library System");
        setSize(1080, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/main/resources/static/favicon.png").getImage());

        // Set cardPanel to use CardLayout
        this.cardPanel = new JPanel(new CardLayout());
        this.cardController = new CardController(cardPanel);

        // Initialize UIs
        initializeUI();

        // Add cardPanel and buttonPanel to the frame
        add(cardPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    private void initializeUI() {
        BootUI bootUI = new BootUI(this);
        cardPanel.add(bootUI, "Boot");
        LoginUI loginUI = new LoginUI(this);
        cardPanel.add(loginUI, "Login");
        RegisterUI registerUI = new RegisterUI(this);
        cardPanel.add(registerUI, "Register");
        BookUI bookUI = new BookUI(this);
        cardPanel.add(bookUI, "Book");
    }
    @Override
    public void switchView(String viewName) {
        cardController.showCard(viewName);
    }
    @Override
    public void setUser(User user) {
        cardController.setUser(user);
    }


}