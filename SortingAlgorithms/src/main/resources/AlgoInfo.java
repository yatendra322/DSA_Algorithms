package org.sortingAlgos.algoInfo;

import java.util.List;

public class AlgoInfo {
    private String name;                // Algorithm name
    private String definition;          // Short definition
    private String algoType;            // Algo type
    private String bestCase;            // Best case time complexity
    private String averageCase;         // Average case time complexity
    private String worstCase;           // Worst case time complexity
    private String spaceComplexity;     // Total space complexity
    private String auxiliarySpace;      // Extra memory required
    private List<String> keyPoints;     // Key points
    private List<String> advantages;    // Advantages
    private List<String> disadvantages; // Disadvantages

    // Constructors
    public AlgoInfo() {
    }

    public AlgoInfo(String name, String definition, String type, String bestCase, String averageCase,
                    String worstCase, String spaceComplexity, String auxiliarySpace,
                    List<String> keyPoints, List<String> advantages, List<String> disadvantages) {
        this.name = name;
        this.definition = definition;
        this.algoType = type;
        this.bestCase = bestCase;
        this.averageCase = averageCase;
        this.worstCase = worstCase;
        this.spaceComplexity = spaceComplexity;
        this.auxiliarySpace = auxiliarySpace;
        this.keyPoints = keyPoints;
        this.advantages = advantages;
        this.disadvantages = disadvantages;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getAlgoType() {
        return algoType;
    }

    public void setAlgoType(String algoType) {
        this.algoType = algoType;
    }

    public String getBestCase() {
        return bestCase;
    }

    public void setBestCase(String bestCase) {
        this.bestCase = bestCase;
    }

    public String getAverageCase() {
        return averageCase;
    }

    public void setAverageCase(String averageCase) {
        this.averageCase = averageCase;
    }

    public String getWorstCase() {
        return worstCase;
    }

    public void setWorstCase(String worstCase) {
        this.worstCase = worstCase;
    }

    public String getSpaceComplexity() {
        return spaceComplexity;
    }

    public void setSpaceComplexity(String spaceComplexity) {
        this.spaceComplexity = spaceComplexity;
    }

    public String getAuxiliarySpace() {
        return auxiliarySpace;
    }

    public void setAuxiliarySpace(String auxiliarySpace) {
        this.auxiliarySpace = auxiliarySpace;
    }

    public List<String> getKeyPoints() {
        return keyPoints;
    }

    public void setKeyPoints(List<String> keyPoints) {
        this.keyPoints = keyPoints;
    }

    public List<String> getAdvantages() {
        return advantages;
    }

    public void setAdvantages(List<String> advantages) {
        this.advantages = advantages;
    }

    public List<String> getDisadvantages() {
        return disadvantages;
    }

    public void setDisadvantages(List<String> disadvantages) {
        this.disadvantages = disadvantages;
    }

    @Override
    public String toString() {
        return "AlgoInfo{" +
                "name='" + name + '\'' +
                ", definition='" + definition + '\'' +
                ", bestCase='" + bestCase + '\'' +
                ", averageCase='" + averageCase + '\'' +
                ", worstCase='" + worstCase + '\'' +
                ", spaceComplexity='" + spaceComplexity + '\'' +
                ", auxiliarySpace='" + auxiliarySpace + '\'' +
                ", keyPoints=" + keyPoints +
                ", advantages=" + advantages +
                ", disadvantages=" + disadvantages +
                '}';
    }
}
