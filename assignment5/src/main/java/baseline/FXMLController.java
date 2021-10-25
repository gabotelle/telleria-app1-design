package baseline;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class FXMLController {

    @FXML
    private MenuButton lists;

    @FXML
    private Button showIncomplete;

    @FXML
    private Button showCompleted;

    @FXML
    private Button showAll;

    @FXML
    private Button editListName;

    @FXML
    private TextField newListName;

    @FXML
    private Button createList;

    @FXML
    private ListView<?> listView;

    @FXML
    private Text itemName;

    @FXML
    private Text itemDescription;

    @FXML
    private CheckBox completed;

    @FXML
    private Button removeItem;

    @FXML
    private TextField itemNameField;

    @FXML
    private TextField itemDescriptionField;

    @FXML
    private TextField itemDateField;

    @FXML
    private Button addItem;

    @FXML
    private Button editItem;

    @FXML
    private TextField fileField;

    @FXML
    private Button saveList;

    @FXML
    private Button loadList;


}
