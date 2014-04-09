package mcmod.nxs.animalwarriors.lib;

public class ResourcePathHelper {

	private static String resourcePath;
	public static ResourcePathHelper instance;

	public void load(String resourcePath)
	{
		try
		{
			System.out.println("[MinExtension] (LibResourcePath) Loading resource path settings.");
			setTexturesPath(resourcePath);
			instance = new ResourcePathHelper();
		} catch (Exception e)
		{
			System.out.println("[MinExtension] (LibResourcePath) Failed loading resource path settings.");
		}
		System.out.println("[MinExtension] (LibResourcePath) Done.");
		System.out.println("[MinExtension] (LibResourcePath) Resource path set to " + getResourcesPath() + ".");
	}

	public static String getResourcesPath()
	{
		return resourcePath;
	}

	public static void setTexturesPath(String texturesPath)
	{
		ResourcePathHelper.resourcePath = texturesPath;
	}

	public void load()
	{

	}
}
