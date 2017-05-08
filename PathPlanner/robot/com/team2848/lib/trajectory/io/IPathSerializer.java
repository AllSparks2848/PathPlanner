package com.team2848.lib.trajectory.io;

import com.team2848.lib.trajectory.Path;

/**
 * Interface for methods that serialize a Path or Trajectory.
 *
 * 
 */
public interface IPathSerializer {

  public String serialize(Path path);
}
