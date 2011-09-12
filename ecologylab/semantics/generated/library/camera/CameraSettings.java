package ecologylab.semantics.generated.library.camera;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.metadata.scalar.MetadataFloat;

/**
*  CameraSettings.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Mixin: Image description from EXIF image metadata.
 */ 
@simpl_inherit
public class CameraSettings extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString subjectDistance;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString exposureTime;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataFloat aperture;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataFloat shutterSpeed;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString model;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString orientation;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataInteger resolution;

	public CameraSettings()
	{ }

	public CameraSettings(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	subjectDistance()
	{
		MetadataString	result = this.subjectDistance;
		if (result == null)
		{
			result = new MetadataString();
			this.subjectDistance = result;
		}
		return result;
	}

	public String getSubjectDistance()
	{
		return this.subjectDistance == null ? null : subjectDistance().getValue();
	}

	public MetadataString getSubjectDistanceMetadata()
	{
		return subjectDistance;
	}

	public void setSubjectDistance(String subjectDistance)
	{
		if (subjectDistance != null)
			this.subjectDistance().setValue(subjectDistance);
	}

	public void setSubjectDistanceMetadata(MetadataString subjectDistance)
	{
		this.subjectDistance = subjectDistance;
	}

	public MetadataString	exposureTime()
	{
		MetadataString	result = this.exposureTime;
		if (result == null)
		{
			result = new MetadataString();
			this.exposureTime = result;
		}
		return result;
	}

	public String getExposureTime()
	{
		return this.exposureTime == null ? null : exposureTime().getValue();
	}

	public MetadataString getExposureTimeMetadata()
	{
		return exposureTime;
	}

	public void setExposureTime(String exposureTime)
	{
		if (exposureTime != null)
			this.exposureTime().setValue(exposureTime);
	}

	public void setExposureTimeMetadata(MetadataString exposureTime)
	{
		this.exposureTime = exposureTime;
	}

	public MetadataFloat	aperture()
	{
		MetadataFloat	result = this.aperture;
		if (result == null)
		{
			result = new MetadataFloat();
			this.aperture = result;
		}
		return result;
	}

	public Float getAperture()
	{
		return this.aperture == null ? 0 : aperture().getValue();
	}

	public MetadataFloat getApertureMetadata()
	{
		return aperture;
	}

	public void setAperture(Float aperture)
	{
		if (aperture != 0)
			this.aperture().setValue(aperture);
	}

	public void setApertureMetadata(MetadataFloat aperture)
	{
		this.aperture = aperture;
	}

	public MetadataFloat	shutterSpeed()
	{
		MetadataFloat	result = this.shutterSpeed;
		if (result == null)
		{
			result = new MetadataFloat();
			this.shutterSpeed = result;
		}
		return result;
	}

	public Float getShutterSpeed()
	{
		return this.shutterSpeed == null ? 0 : shutterSpeed().getValue();
	}

	public MetadataFloat getShutterSpeedMetadata()
	{
		return shutterSpeed;
	}

	public void setShutterSpeed(Float shutterSpeed)
	{
		if (shutterSpeed != 0)
			this.shutterSpeed().setValue(shutterSpeed);
	}

	public void setShutterSpeedMetadata(MetadataFloat shutterSpeed)
	{
		this.shutterSpeed = shutterSpeed;
	}

	public MetadataString	model()
	{
		MetadataString	result = this.model;
		if (result == null)
		{
			result = new MetadataString();
			this.model = result;
		}
		return result;
	}

	public String getModel()
	{
		return this.model == null ? null : model().getValue();
	}

	public MetadataString getModelMetadata()
	{
		return model;
	}

	public void setModel(String model)
	{
		if (model != null)
			this.model().setValue(model);
	}

	public void setModelMetadata(MetadataString model)
	{
		this.model = model;
	}

	public MetadataString	orientation()
	{
		MetadataString	result = this.orientation;
		if (result == null)
		{
			result = new MetadataString();
			this.orientation = result;
		}
		return result;
	}

	public String getOrientation()
	{
		return this.orientation == null ? null : orientation().getValue();
	}

	public MetadataString getOrientationMetadata()
	{
		return orientation;
	}

	public void setOrientation(String orientation)
	{
		if (orientation != null)
			this.orientation().setValue(orientation);
	}

	public void setOrientationMetadata(MetadataString orientation)
	{
		this.orientation = orientation;
	}

	public MetadataInteger	resolution()
	{
		MetadataInteger	result = this.resolution;
		if (result == null)
		{
			result = new MetadataInteger();
			this.resolution = result;
		}
		return result;
	}

	public Integer getResolution()
	{
		return this.resolution == null ? 0 : resolution().getValue();
	}

	public MetadataInteger getResolutionMetadata()
	{
		return resolution;
	}

	public void setResolution(Integer resolution)
	{
		if (resolution != 0)
			this.resolution().setValue(resolution);
	}

	public void setResolutionMetadata(MetadataInteger resolution)
	{
		this.resolution = resolution;
	}
}
