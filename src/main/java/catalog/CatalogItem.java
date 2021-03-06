package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {
    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.features.addAll(Arrays.asList(features));
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int numberOfPagesAtOneItem() {
        int sumPage = 0;
        for (Feature item : features) {
            if (item instanceof PrintedFeatures) {
                sumPage += ((PrintedFeatures) item).getNumberOfPages();
            }
        }
        return sumPage;
    }

    public int fullLengthAtOneItem() {
        int sumLength = 0;
        for (Feature item : features) {
            if (item instanceof AudioFeatures) {
                sumLength += ((AudioFeatures) item).getLength();
            }
        }
        return sumLength;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature item : features) {
            contributors.addAll(item.getContributors());
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature item : features) {
            titles.add(item.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature item : features) {
            if (item instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature item : features) {
            if (item instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }
}
