package ch02_observer;

import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;

public class RxStart {
    CompositeDisposable disposable = new CompositeDisposable();

    void createSingleSource() {
        Single.just(true)
                .subscribe(it -> {
                    System.out.println(it);
                });
    }

    void subscribeSource() {
        disposable.add(
                Single.just(new int[]{1, 2, 3, 4, 5})
                        .subscribe(number -> {
                            System.out.println(number);
                        }));
    }

    void clearSubscription() {
        disposable.clear();
    }
}