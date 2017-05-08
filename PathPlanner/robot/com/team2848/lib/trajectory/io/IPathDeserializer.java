package com.team2848.lib.trajectory.io;

import com.team2848.lib.trajectory.Path;

/**
 * Interface for methods that deserializes a Path or Trajectory.
 * 
 *
 */
public interface IPathDeserializer {
  
  public Path deserialize(String serialized);
}
