package HW_4;
import HW_4.NoteController;
import HW_4.*;

import HW_4.ViewNote;
public class Main {
    
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("Notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}



