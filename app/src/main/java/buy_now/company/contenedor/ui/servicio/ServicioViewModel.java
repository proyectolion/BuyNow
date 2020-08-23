package buy_now.company.contenedor.ui.servicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServicioViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ServicioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Servicio fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
