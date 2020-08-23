package buy_now.company.contenedor.ui.preguntas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PreguntasViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PreguntasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Preguntas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
