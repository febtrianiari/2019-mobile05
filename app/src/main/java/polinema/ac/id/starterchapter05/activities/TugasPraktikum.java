package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandsFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class TugasPraktikum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_praktikum);
    }

    public void handlerClickPushups(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PushupsFragment pushupsFragment = (PushupsFragment) getSupportFragmentManager().findFragmentByTag("PUSH_FRAGMENT");
        if(pushupsFragment != null && pushupsFragment.isVisible()){
            //fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.Tugas_Fragment, new PushupsFragment(), "PUSH_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerCLickDips(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("DIPS_FRAGMENT");
        if(dipsFragment != null && dipsFragment.isVisible()){
            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.Tugas_Fragment, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HandstandsFragment handstandsFragment = (HandstandsFragment) getSupportFragmentManager().findFragmentByTag("HANDSTAND_FRAGMENT");
        if(handstandsFragment != null && handstandsFragment.isVisible()){
            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.Tugas_Fragment, new HandstandsFragment(), "HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
