package com.virtusa.inventory.invoice.service;

import java.util.List;
import java.util.Optional;

import com.virtusa.inventory.invoice.model.RewardPoint;


public interface RewardPointService {

	//save the rewardPoints
	RewardPoint save(RewardPoint rewardPoint);

	//fetch all rewardPoints 
	List<RewardPoint> fetchAllRewardPoint();

	//fetch reward point relevant to the id
	Optional<RewardPoint> fetchById(Integer id);

	//fetch by reward value
	List<RewardPoint> fetchByRewardValue(Double value);

}