package fr.soat.demo.exo4_bindingadapters;

import java.util.List;

import fr.soat.demo.moviesmodel.model.MovieSeriesModel;

/**
 * Created by yann_huriez on 10/02/17.
 */

public interface FilterListener {

    void onShowMovieSeries(List<MovieSeriesModel> model);
}
